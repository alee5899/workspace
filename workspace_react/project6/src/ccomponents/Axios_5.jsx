import React, { useEffect, useState } from 'react';
import './Axios_5.css';
import axios from 'axios';

export const Axios_5 = () => {
  const [personList, setPersonList] = useState([]);
  const [student, setStudent] = useState([]);

  const getPersonList = () => {
    axios.get('/api/t4')
      .then((res) => {
        console.log(res.data);
        setPersonList(res.data);
      })
      .catch((error) => {
        console.log('오류발생');
      });
  }

  const getStudent = () => {
    axios.get('/api/t5')
      .then((res) => {
        console.log(res.data);
        setStudent(res.data);
      })
      .catch((error) => {
        console.log('오류발생');
        console.log(error);
      });
  }

  return (
    <>
      <div>Axios_5</div>
      <table className='t1'>
        <colgroup>
          <col width={'50%'} />
          <col width={'50%'} />
        </colgroup>
        <tbody>
          <tr className='t1-tr'>
            <td>
              <button type='button' onClick={getPersonList}>버튼1</button>
              <table border={1}>
                <thead>
                  <tr>
                    <th>이름</th>
                    <th>나이</th>
                    <th>주소</th>
                  </tr>
                </thead>
                <tbody>
                  {
                    personList.length===0
                    ?
                    <tr>
                      <td colSpan={3}>
                        버튼1을 클릭하면 데이터가 조회됩니다
                      </td>
                    </tr>
                    :
                    personList.map((person,i)=>{
                      return(
                      <>
                          <tr key={i}>
                            <td>{person.name}</td>
                            <td>{person.age}</td>
                            <td>{person.addr}</td>
                          </tr>
                      </>
                      )
                    })
                  }
                </tbody>
              </table>
            </td>
            {/* --------------------------------------------- */}
            <td>
              <button type='button' onClick={getStudent}>버튼2</button>
              <table border={2}>
                <thead>
                  <tr>
                    <th>이름</th>
                    <th>국어</th>
                    <th>영어</th>
                    <th>수학</th>
                    <th>총점</th>
                  </tr>
                </thead>
                <tbody>
                  {
                    student.length===0
                    ?
                    <tr>
                      <td colSpan={3}>
                        버튼1을 클릭하면 데이터가 조회됩니다
                      </td>
                    </tr>
                    :
                    student.map((student1,i)=>{
                      return(
                      <>
                          <tr key={i}>
                            <td>{student1.name}</td>
                            <td>{student1.korScore}</td>
                            <td>{student1.engScore}</td>
                            <td>{student1.mathScore}</td>
                            <td>{student1.korScore + student1.engScore + student1.mathScore}</td>
                          </tr>
                      </>
                      )
                    })
                  }
                </tbody>
              </table>
            </td>
          </tr>
        </tbody>
      </table>
    </>
  );
}

export default Axios_5;



