# Условие задачи
Написать программу, которая из имеющегося массива строк формирует новый массив из строк, длина которых меньше, либо равна 3 символам. Первоначальный массив можно ввести с клавиатуры, либо задать на старте выполнения алгоритма. При решении не рекомендуется пользоваться коллекциями, лучше обойтись исключительно массивами.
# Решение задачи
## Т.к. использовать коллекции не рекомедуется, то следует сперва узнать длинну массива строк, который должен получиться.

Для этого спользуем перебор массива с помощью цикла **for** и проверку длинны каждого из элементов массива c помощью оператора **if**. Все это мы дбавляем в метод **CountingNumberOfStrings** котовый будет принимать на вход заданный массив и возвращать количество элементов **numbers**, соответствующих условию *(array[i].Length <= 3)*

Пример кода:
```sh
int CountingNumberOfStrings(string[] array)
{
    int number = 0;
    for (int i = 0; i < array.Length; i++)
    {
        if (array[i].Length <= 3)
        {
            number++;
        }
    }
    return number;
}
```
Далее нужно создать массив в который мы будем присваивать нужные значения из заданного массива ***secondArray*** и его длинна будет соответствовать **numbers**
```sh
string[] secondArray = new string[number];
```
Потом создадим метод (**CreateNewArray**) в котором будем присваивать нужные значения элементам массива (**secondArray**) через тот же цикл **for** и  оператор **if** с там же условием *(array[i].Length <= 3)*

```sh
string[] CreateNewArray(string[] array,int number)
{
  string[] secondArray = new string[number];
  int j = 0;
  for (int i = 0; i < array.Length; i++)
  {
    if (array[i].Length <= 3) 
    {
     secondArray[j] = array[i];j++;
    }
  }
  return secondArray;
}
```
где **j** - номер элемента нового массива *(j < number-1)*

И, наконец, вывод массива **secondArray** через цикл **foreach** *(чтобы разнообразить код и, как известно, foreach работает немного быстрее чем for)*
в методе **WriteArray**
```sh
static void WriteArray(string[] secondArray)
{
    foreach (string s in secondArray)
    {
        Console.WriteLine(s);
    }
}
```
## Для проверки работоспосбности кода добавим строки ввода массива строк и использования методов
```sh
string[] strings = { "Sun", "Monday", ".", "...", "Thirsday", "=-)", "qqqqq" };
WriteArray(CreateNewArray (strings, CountingNumberOfStrings(strings)));

```
# Концовка
Таким образом мы решили задачу по рекомендации без использования коллекций с применение методов.