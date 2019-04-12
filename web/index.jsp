<%--
  Created by IntelliJ IDEA.
  User: 叶朝泽
  Date: 2019/4/12
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <style type="text/css">
    .center{position: absolute;top: 30%;  left: 32%;margin: auto;border:0.5px solid #000;width:auto;height:auto}
  </style>
  <body background="/images/timg.jpg"><form action="/showtake" method="post">
  <div class="center">

    <div align="center">
      起飞机场:
      <select  name="takeid">
        <option value="0">请选择</option>
        <c:forEach items="${takePort}" var="take">
          <option value="${take.id}">${take.portName}</option>
        </c:forEach>
      </select>
      降落机场:
      <select name="landid">
        <option value="0">请选择</option>
        <c:forEach items="${landPort}" var="land">
          <option value="${land.id}">${land.portName}</option>
        </c:forEach>
      </select>
          <input type="submit" value="查询"/>
    </div>

  <table border="1">
    <tr>
      <th>飞机型号</th>
      <th>起飞机场</th>
      <th>起飞城市</th>
      <th>降落机场</th>
      <th>降落城市</th>
      <th>航行时间</th>
      <th>票价(元)</th>
    </tr>

    <c:forEach items="${showAirplane}" var="list">
      <tr>
        <td>${list.airNo}</td>
        <td>${list.takePort.portName}</td>
        <td>${list.takePort.cityName}</td>
        <td>${list.landPort.portName}</td>
        <td>${list.landPort.cityName}</td>
        <td>
        <c:if test="${list.time<60}">
          ${list.time}分钟
        </c:if>
        <c:if test="${list.time>=60}">
          ${Math.floor(list.time/60)}小时${Math.floor(list.time%60)}分钟
        </c:if>
        </td>
        <td><font  color="red"><strong>${list.price}</strong></font></td>
      </tr>
    </c:forEach>

  </table>

  </div>
  </form>
  </body>
</html>
