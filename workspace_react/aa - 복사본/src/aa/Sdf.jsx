import axios from 'axios';
import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';

const Sdf = () => {
  const nav = useNavigate();
  const [insertNoti, setInsertNoti] = useState({
    writer: '',
    title: '',
    content: '',
  });

  const insertChange = (e) => {
    setInsertNoti({
      ...insertNoti,
      [e.target.name]: e.target.value,
    });
  };

  const insertFarmers = () => {
    axios.post('api/farmers', insertNoti)
      .then((res) => {
        alert('등록성공!');
        nav('/noti');
      })
      .catch((error) => {
        console.log(error);
      });
  };

  return (
    <>
      <div className='aa'>
        <table >
          <tbody>
            <tr>
              <td>작성자</td>
              <td>
                <input
                  type="text"
                  name="writer"
                  value={insertNoti.writer}
                  onChange={insertChange}
                />
              </td>
            </tr>
            <tr>
              <td>제목</td>
              <td>
                <input
                  type="text"
                  name="title"
                  value={insertNoti.title}
                  onChange={insertChange}
                />
              </td>
            </tr>
            <tr>
              <td>내용</td>
              <td>
                <textarea
                  rows={7}
                  cols={23}
                  name="content"
                  value={insertNoti.content}
                  onChange={insertChange}
                />
              </td>
            </tr>
          </tbody>
        </table>
        <button type="button" onClick={insertFarmers}>
          등록하기
        </button>
      </div>
    </>
  );
};

export default Sdf;
