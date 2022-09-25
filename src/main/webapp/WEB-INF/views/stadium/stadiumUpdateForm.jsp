<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@include file="../layout/header.jsp"%>

<div class="container">
	<h1>경기장 수정 페이지입니다.</h1>
</div>

<form id="frm">
	<input type="text" name="id" value="${stadium.id}"/>
	<input type="text" name="createDate" value="${stadium.createDate}"/>
	경기장 이름 : <input type="text" name="name" value="${stadium.name}"/>
	<button type="button" onclick="stardiumSave()">수정</button>
</form>

<script src="/js/stardium.js"></script>

<%@include file="../layout/footer.jsp"%>
