def array_diff(a, b):
    # iterate through b
    for number_removed in b:
        # iterate through a
        while number_removed in a:
            a.remove(number_removed)
    return a