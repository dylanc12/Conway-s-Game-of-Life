document.addEventListener('click', function(e) {
  e = e || window.event;
  target = e.target || e.srcElement,
      text = target.textContent || target.innerText;   
  if(target != document.getElementById("body") && target != document.getElementById("html")){
    update(e, target);
  }
}, false);

function update(e, targ){
  const elem = e.target.innerText;
  console.log(elem);
  
  targ.style.backgroundColor = "yellow";
  targ.style.color = "yellow";
  
}