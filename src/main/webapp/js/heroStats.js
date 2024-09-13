function increaseStat(stat){
  let pointsBlock = document.getElementById("availablePoints");
  let availablePoints = parseInt(pointsBlock.innerHTML);
  let extraStatBlock = document.getElementById(stat+"Extra");
  let extraStatPoints = parseInt(extraStatBlock.value);

  if(availablePoints > 0){
    pointsBlock.innerHTML = --availablePoints;
    extraStatBlock.value = ++extraStatPoints;
    showStat(stat);
  }
}

function decreaseStat(stat){
  let pointsBlock = document.getElementById("availablePoints");
  let availablePoints = parseInt(pointsBlock.innerHTML);
  let extraStatBlock = document.getElementById(stat+"Extra");
  let extraStatPoints = parseInt(extraStatBlock.value);

  if(extraStatPoints > 0){
    pointsBlock.innerHTML = ++availablePoints;
    extraStatBlock.value = --extraStatPoints;
    showStat(stat);
  }
}

function showStat(stat){

  block = document.getElementById(stat+"Total");
  extra = document.getElementById(stat+"Extra");
  base = document.getElementById(stat+"Base");

  block.innerHTML = parseInt(extra.value) + parseInt (base.innerHTML);

}