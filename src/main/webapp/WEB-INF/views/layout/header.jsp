<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>FINAL</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" rel="stylesheet">
<link href="/css/style.css" rel="stylesheet">
<link href="/css/global.css" type="text/css" rel="stylesheet" />
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css" rel="stylesheet" />
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet" />
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

</head>

<body>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	
		<div class="container-fluid">
		
			<a class="navbar-brand" href="/stadium">FINAL</a>
			
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
				data-bs-target="#collapsibleNavbar">
				<span class="navbar-toggler-icon"></span>
			</button>
			
			<div class="collapse navbar-collapse" id="collapsibleNavbar">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link" href="/stadiumList">경기장 목록</a></li>
					<li class="nav-item"><a class="nav-link" href="/stadiumInsertForm">경기장 등록</a></li>
					<li class="nav-item"><a class="nav-link" href="/teamList">팀 목록</a></li>
					<li class="nav-item"><a class="nav-link" href="/teamInsertForm">팀 등록</a></li>
					<li class="nav-item"><a class="nav-link" href="/playerList">선수 목록</a></li>
					<li class="nav-item"><a class="nav-link" href="/playerInsertForm">선수 등록</a></li>
					<li class="nav-item"><a class="nav-link" href="/teamPositionList">팀별 포지션 목록</a></li>
					<li class="nav-item"><a class="nav-link" href="/expulsionPlayerList">퇴출된 선수 목록</a></li>
					<li class="nav-item"><a class="nav-link" href="/expulsionReasonInsertForm">퇴출 사유 등록</a></li>
				</ul>
			</div>
		</div>
	</nav>