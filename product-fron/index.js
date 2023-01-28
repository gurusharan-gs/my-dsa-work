

     // http://localhost:8888/product

     // adding product into database function
     async function addProduct() {
          let pro_data = {

               productName: document.getElementById("name").value,
               price: document.getElementById("price").value,
               rating: document.getElementById("rating").value,
               url: document.getElementById("url").value,

          }
          pro_data = JSON.stringify(pro_data)

          let api_link = `http://localhost:8888/product`
          let response = await fetch(api_link, {
               method: "POST",
               body: pro_data,
               headers: {
                    'Content-Type': 'application/json'
               }
          })
          let data = await response.json()

          if (data.message != null) {
               alert(data.message);
          }
          else {
               // displayData1(data);
               append(data)
               console.log(data);

          }
     }


     // view all product  into database function
     async function viewAllPro() {

          fetch('http://localhost:8888/product/list')
               .then((response) => response.json())
               .then((data) => append(data));
          // displayData1(data)
          // append(data)
     }
     viewAllPro();


     // delete product into database function
     async function deletePro() {
          let key = document.getElementById("delete").value;

          let api_link = `http://localhost:8888/product/delete/${key}`
          let response = await fetch(api_link, {
               method: "DELETE",
               headers: {
                    'Content-Type': 'application/json'
               }
          })
          let data = await response.json()

          if (data.message != null) {
               alert(data.message);
          }
          else {
               // displayData1(data)
               console.log(data)
          }

     }



     async function viewProById() {
          let key = document.getElementById("findId").value;

          fetch(`http://localhost:8888/product/get/${key}`)
               .then((response) => response.json())
               .then((data) => console.log(data));
          // displayData1(data)
     }



     async function updateProduct() {

          let pro_data = {

               productId: document.getElementById("prdId1").value,
               productName: document.getElementById("name1").value,
               price: document.getElementById("price1").value,
               rating: document.getElementById("rating1").value,
               url: document.getElementById("url1").value,
          }

          pro_data = JSON.stringify(pro_data)

          let api_link = `http://localhost:8888/product/update`
          let response = await fetch(api_link, {
               method: "PUT",
               body: pro_data,
               headers: {
                    'Content-Type': 'application/json'
               }
          })
          let data = await response.json()
          if (data.message != null) {
               alert(data.message);
          }
          else {
               //     displayData1(data)
               console.log(data)
          }
     }




     let append = (data) => {
          document.getElementById("container").innerHTML = ""
          console.log(data)
          data.forEach((el, index) => {
               let container = document.getElementById("container")
               let img = document.createElement("img");
               // img.src = el.img
               img.setAttribute("src", el.url)

               let h1 = document.createElement("p");
               h1.innerText = el.productId

               let p = document.createElement("p");
               p.innerText = `${el.productName}`

               let pp = document.createElement("h3");
               pp.innerText = `₹ : ${el.price}`

               let rat = document.createElement("p");
               rat.innerText = el.rating

               let div = document.createElement("div")
               div.append(img, h1, p, pp, rat)
               container.append(div)
          })
     }

     // append()




// displayData1();

