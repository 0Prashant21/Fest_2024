def day_name(day_num):
    days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
    if 1 <= day_num <= 7:
        return days[day_num - 1]
    else:
        return "Invalid input"

day_num = int(input("Enter a number (1-7): "))
print(day_name(day_num))
