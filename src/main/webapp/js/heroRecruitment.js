function showStartingStats(select){
  let position = select.selectedIndex-1;
  for(let i = 0; i<select.length; i++)
    document.getElementById("startingStats"+i).style.display = (i == position)?"block":"none";
}