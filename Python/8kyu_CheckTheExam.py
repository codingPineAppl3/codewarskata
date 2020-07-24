def check_exam(arr1,arr2):
    points = 0
    for a, b in zip(arr1, arr2):
        if a == b:
            points += 4
        elif a == "" or b == "":
            points += 0
        else:
            points -= 1
    return 0 if points <= 0 else points