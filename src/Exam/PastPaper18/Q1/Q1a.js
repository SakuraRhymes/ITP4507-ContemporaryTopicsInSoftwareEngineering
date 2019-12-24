function Card(suit, number) {
    this.error = false;
    this.setSuit(suit);
    this.setNumber(number);
}

Card.prototype.getCard = function () {
    if (this.error) {
        return "This card contains an error!";
    }

    let suitString, numberString;
    switch (this.suit) {
        case 1:
            suitString = "Spade";
            break;
        case 2:
            suitString = "Heart";
            break;
        case 3:
            suitString = "Club";
            break;
        case 4:
            suitString = "Diamond";
            break;
    }

    switch (this.number) {
        case 1:
            numberString = "Ace";
            break;
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
            numberString = `0${this.number}`;
            break;
        case 10:
            numberString = "10";
            break;
        case 11:
            numberString = "Jack";
            break;
        case 12:
            numberString = "Queen";
            break;
        case 13:
            numberString = "King";
            break;
    }

    return `${suitString}:${numberString}`;
};

Card.prototype.setSuit = function (suit) {
    if (suit > 0 && suit < 5) {
        this.suit = suit;
    } else {
        this.error = true;
    }
};

Card.prototype.setNumber = function (number) {
    if (number > 0 && number < 14) {
        this.number = number;
    } else {
        this.error = true;
    }
};

function BJCard(suit, number) {
    Card.call(this, suit, number);

    switch (number) {
        case 1:
            this.point = 11;
            break;
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
            this.point = number;
            break;
        case 11:
        case 12:
        case 13:
            this.point = 10;
            break;
    }
}

BJCard.prototype = new Card();

BJCard.prototype.getCard = function () {
    if (this.error) {
        return "This card contains an error!";
    } else {
        return `${Card.prototype.getCard.call(this)}:${this.point}`;
    }
};


// Testing Code


var c1 = new Card(1, 11);
var c2 = new Card(5, 12);
var c3 = new Card(2, 15);
document.write(c1.getCard() + "<br />");
document.write(c2.getCard() + "<br />");
document.write(c3.getCard() + "<br />");
var bj1 = new BJCard(1, 1);
var bj2 = new BJCard(2, 13);
var bj3 = new BJCard(4, 7);
var bj4 = new BJCard(1, 14);
document.write(bj1.getCard() + "<br />");
document.write(bj2.getCard() + "<br />");
document.write(bj3.getCard() + "<br />");
document.write(bj4.getCard() + "<br />");