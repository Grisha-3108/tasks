Задача 1:

Напишите программу, в которой создаются два потока, которые выводят на консоль своё имя. (Один через Thread, второй
через Runnable)

Задача 2:

Запустите побочный поток и сделайте так, чтобы основной поток дождался завершения побочного

Задача 3:

Запустите побочный поток и сделайте так, чтобы побочный поток завершился сразу же после завершения основного (через демона)

Задача 4:

Создайте общий ресурс (поле) для двух потоков. Сделайте так, чтобы потоки последовательно обращались к этому ресурсу

Задача 5:

Создайте поток-демон с бесконечным циклом. Основной поток должен ожидать выполнения побочного потока. После 5 секунд
побочный поток должен уведомить основной о продолжении работы.

Задача 6:

Создайте поток с бесконечным циклом. Основной поток должен ожидать выполнения побочного потока. После 5 секунд
основной поток должен уведомить побочный о завершении его работы. (через прерывания)