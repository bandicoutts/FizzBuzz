def main():
  
  for i in list(range(1, 101)):
    s = str(i) + ": "

    if i % 3 != 0 and i % 5 != 0:
      s += str(i)
    else:
      if (i % 3 == 0) and (i % 5 == 0):
        s += "FizzBuzz"
      elif i % 3 == 0:
        s += "Fizz"
      elif i % 5 == 0:
        s += "Buzz"

    print(s)



main()