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

static void WriteArray(string[] secondArray)
{
    foreach (string s in secondArray)
    {
        Console.WriteLine(s);
    }
}

string[] strings = { "Sun", "Monday", ".", "...", "Thirsday", "=-)", "qqqqq" };
WriteArray(CreateNewArray (strings, CountingNumberOfStrings(strings)));
