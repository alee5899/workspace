import { useState } from "react"
import { data } from "./data/data"
import { icon } from "../contants/icons"

// const [list,setList] = useState(data);
// const [ newItem,setNewItem] = useState('');

const Main = () => {


  return (
    <div>
      <h3>To Do List</h3>
      <input type="text" />
      <button type="button">등록</button>
      <div>
        {
          list.map((d,i)=>{
            return(
              <div key={i}>
              <p>{d.newItem}</p>
              <img src="" alt="" />
              <img src={icon.ICON_DELETE} alt="" />
            </div>
            )
          })
        }
      </div>
        
    </div>
  )
}

export default Main