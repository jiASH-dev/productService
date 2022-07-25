<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <link href="css/normalize.css" rel="stylesheet" type="text/css">
    <link href="css/header.css" rel="stylesheet" type="text/css">
</head>
<header class="row headerInfo">
    <div class="headerInfo__schedule col-4 col-xs-4">
        <p>Наш телефон</p>
        <p class="headerInfo__schedule__telephone">+996705188955</p>
        <p class="headerInfo__schedule__time">работаем с 9:00 до 18:00</p>
    </div>
    <div class="headerInfo__other col-6 col-xs-5">
        <a href="about.html" class="headerInfo__other__about">О НАС</a>
        <a href="#" class="headerInfo__other__reviews">ОТЗЫВЫ</a>
        <a href="#" class="headerInfo__other__shippingAndPayment">ДОСТАВКА И ОПЛАТА</a>
    </div>
    <div class="headerInfo__menuAndBasket col-2 col-xs-3">
        <div class="headerInfo__menuAndBasket__dropdownMenu">
            <span class="headerInfo__menuAndBasket__dropdownMenu__text">Меню</span>
            <div class="headerInfo__menuAndBasket__dropdownMenu__content">
                <a href="#">Системные блоки</a>
                <a href="#">Ноутбуки</a>
                <a href="#">Куллеры</a>
                <a href="#">СВО</a>
                <a href="#">Оперативная память</a>
                <a href="#">Жесткие диски</a>
                <a href="#">SSD</a>
                <a href="#">Блоки питания</a>
                <!--                    <a href="#">Корпуса</a>-->
                <form action="http://localhost:8081/cases" method="GET">
                    <input type="hidden" name="productStatus" value="IN_STOCK">
                    <input type="hidden" name="pageNumber" value="1">
                    <input type="submit" value="Корпуса">
                </form>
            </div>
        </div>
        <div class="headerInfo__menuAndBasket__dropdownBasket">
            <img class="headerInfo__menuAndBasket__dropdownBasket__image" src="image/basket.png" alt="">
            <div class="headerInfo__menuAndBasket__dropdownBasket__content">
                <p class="headerInfo__menuAndBasket__dropdownBasket__content__firstLine">У вас</p>
                <p class="headerInfo__menuAndBasket__dropdownBasket__content__goodsNumber">0</p>
                <p class="headerInfo__menuAndBasket__dropdownBasket__content__lastLine">товаров в корзине</p>
                <form action="#">
                    <input class="headerInfo__menuAndBasket__dropdownBasket__content__submit" type="submit"
                           value="ДОБАВИТЬ ТОВАРЫ">
                </form>
            </div>
        </div>
    </div>
</header>