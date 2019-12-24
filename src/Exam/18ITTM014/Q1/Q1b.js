// Json String = {"suit": 3, "number": 11}

var url = "https://my-json-server.typicode.com/SakuraRhymes/ITP4507-ContemporaryTopicsInSoftwareEngineering/cards/1";
var http_request = new XMLHttpRequest();
http_request.onreadystatechange = function () {
    if (http_request.readyState == 4) {
        var cardJson = JSON.parse(this.responseText);
        var bjCard = new BJCard(cardJson.suit, cardJson.number);
        document.getElementById("result").innerHTML = (bjCard.getCard());
    }
};
http_request.open("GET", url, true);
http_request.send();