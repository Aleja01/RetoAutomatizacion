#language: en

Feature: SignUp

  As a new user
  I want to sign up in uTest.com
  To use the system


Background:

  Given a new user TestActor has chosen to sign up

  Scenario Outline: Successful sign up

    When he signs up with valid details
      | <firstname> | <lastname> | <email> | <city> | <zipCode> | <country> | <birthMonth> | <birthDay> | <birthYear> | <so> | <version> | <language> | <device> | <model> | <opSystem> | <password> | <cPassword> |

    Then he should see the captcha

    Examples:
      | firstname | lastname | email          | city   | zipCode | country  | birthMonth | birthDay | birthYear   | so    | version | language | device  | model | opSystem    | password   | cPassword  |

      | Gustavo   | López    | gaja@gmail.com | Bogota | 110101  | Colombia | number:1   | number:2 | number:2003 | Linux | Debian  | English  | Alcatel | MD01  | Android 2.0 | Entrada10* | Entrada10* |


