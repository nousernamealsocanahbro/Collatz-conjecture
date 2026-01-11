def main():
    while True:
        steps = 0 # initalized inside loop to reset count on each iteration
        while True:
            try:
                number = int(input("Input number: "))
                if number > 0:
                    break
                else:
                    print("Number must be greater than 0")
            except ValueError:
                print("Invalid input, please try again")

        while number != 1:
            if number % 2 == 0:
                number /= 2
            else:
                number = (number * 3) + 1

            steps += 1
            print(int(number)) # division changes the int into a double, type casting reverts it back

        print(f"Steps: {steps}")

if __name__ == "__main__":
    main()