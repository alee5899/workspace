//ratce
//React Arrow Fuction Component Export

import React from "react";

export const SideMenu = () => {
  function click(){
    console.log(3);
  }
  
  return (
    <>
      <div>SideMenu</div>
      <button type="button" onClick={click}>사이드버튼1</button>
      {/* <button type="button" onClick={click}>사이드버튼2</button> */}
    </>
  );
};
