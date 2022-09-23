function stardiumSave(){
	$("#name").val("");

	let data = $("#frm").serialize();
	alert(data);

	console.log(data);
	$.ajax({
		type: "POST",
		url: "/stardium",
		data: data,
		contentType: "application/x-www-form-urlencoded; charset=utf-8",
		dataType: "text"

	}).done(function(resp){
		console.log(resp);
		alert("성공");
	}).fail(function(error){
		console.log(error);
		alert("실패");
	});
}