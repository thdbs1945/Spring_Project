<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
	 	<title>�Խ���</title>
	</head>
	<body>
	
		<div id="root">
			<header>
				<h1> �Խ���</h1>
			</header>
			<hr />
			 
			<nav>
			  Ȩ - �� �ۼ�
			</nav>
			<hr />
			
			<section id="container">
				<form role="form" method="post" action="/board/write">
					<table>
						<tbody>
							<tr>
								<td>
									<label for="title">����</label><input type="text" id="title" name="title" />
								</td>
							</tr>	
							<tr>
								<td>
									<label for="content">����</label><textarea id="content" name="content" ></textarea>
								</td>
							</tr>
							<tr>
								<td>
									<label for="writer">�ۼ���</label><input type="text" id="writer" name="writer" />
								</td>
							<tr>
								<td>						
									<button type="submit">�ۼ�</button>
								</td>
							</tr>			
						</tbody>			
					</table>
				</form>
			</section>
			<hr />
		</div>
	</body>
</html>