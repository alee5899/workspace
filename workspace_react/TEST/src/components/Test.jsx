import React, { useState } from 'react';
import ReactQuill from 'react-quill';
import 'react-quill/dist/quill.snow.css';

const MyEditor = () => {
  const [content, setContent] = useState('');

  // 이미지 업로드 핸들러
  const handleImageUpload = (file) => {
    const formData = new FormData();
    formData.append('file', file);

    // 서버로 파일을 업로드하는 부분
    // 여기는 실제 서버 URL을 사용해야 합니다
    const uploadUrl = 'https://your-server-url.com/upload'; // 서버 URL

    // 서버로 업로드하고 이미지 URL 받기
    return fetch(uploadUrl, {
      method: 'POST',
      body: formData,
    })
      .then(response => response.json())
      .then(data => {
        // 서버에서 반환한 이미지 URL
        return data.url; // 서버에서 반환한 URL
      })
      .catch(error => {
        console.error('이미지 업로드 실패:', error);
        return null;
      });
  };

  // 툴바에서 이미지를 선택하면 호출될 메서드
  const handleImageInsert = (imageUrl) => {
    // Quill의 insertEmbed를 사용하여 이미지를 에디터에 삽입
    const quill = this.reactQuillRef.getEditor(); // Quill 인스턴스 얻기
    const range = quill.getSelection();
    quill.insertEmbed(range.index, 'image', imageUrl); // 선택된 위치에 이미지 삽입
  };

  // ReactQuill 모듈 설정
  const modules = {
    toolbar: {
      container: [
        [{ 'bold': '굵게' }, { 'italic': '기울임' }, { 'underline': '밑줄' }],
        [{ 'header': [1, 2, 3, false] }],
        ['link', 'image'], // 이미지 버튼을 툴바에 추가
        [{ 'list': 'ordered' }, { 'list': 'bullet' }],
        ['clean'],
      ],
      handlers: {
        image: () => {
          // 이미지를 삽입하려면 파일을 선택하는 창이 열림
          const input = document.createElement('input');
          input.setAttribute('type', 'file');
          input.setAttribute('accept', 'image/*');
          input.click();

          // 파일을 선택했을 때 실행되는 코드
          input.onchange = () => {
            const file = input.files[0];
            if (file) {
              handleImageUpload(file).then(imageUrl => {
                if (imageUrl) {
                  handleImageInsert(imageUrl); // 이미지 URL을 삽입
                }
              });
            }
          };
        },
      },
    },
  };

  return (
    <div>
      <h2>공지사항 작성</h2>
      <ReactQuill
        value={content}
        onChange={setContent}
        modules={modules} // 툴바 설정
        ref={(el) => { this.reactQuillRef = el }} // Quill 인스턴스 참조
      />
    </div>
  );
};

export default MyEditor;
