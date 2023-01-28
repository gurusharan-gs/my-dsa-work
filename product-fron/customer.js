async function viewAllPro(){

     fetch('http://localhost:8888/product/list')
     .then((response) => response.json())
     .then((data) => displaymens(data));
     
     }
  
     viewAllPro()
     
     function displaymens(mensData){
     document.querySelector("#parent").innerHTML="";
     mensData.forEach(function(el){
     let div=document.createElement("div")
     let imag=document.createElement("img")
     imag.setAttribute("src",el.url)
     imag.setAttribute("class","image")
     
     let name=document.createElement("p")
     name.innerText=el.productName;
     name.setAttribute("class","name")
     
     let price=document.createElement("p")
     price.innerText="₹"+el.price
     price.setAttribute("class","price")
     
     let btn=document.createElement("button")
     btn.innerText="Add to Cart"
     btn.setAttribute("class","add_to_cart")
     btn.addEventListener("click",function(){
       btn.disabled=true
       btn.innerText="Go to Cart"
           addToCart(el)
         })
     
     div.append(imag,name,price,btn)
     document.querySelector("#parent").append(div)
     })
     }


     async function viewAllCat(){
      fetch('http://localhost:8888/category/view')
      .then((response) => response.json())
      .then((data) => discat(data));
  }
  
  
  function discat(data){
      document.querySelector("#parent").innerHTML="";
      data.forEach(e => {
          let div=document.createElement("div");
          div.innerText=e.name
  
          div.addEventListener("click",function(){
              displaymens(e.products);
          })
  
          document.getElementById("parent").append(div)
      });
  }