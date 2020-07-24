def triangle(row):
    while (len(row)>1):
        temp=""
        for i in range(len(row)-1):
            if row[i]== "R" and row[i+1] == "G":col = "B"
            elif row[i]== "G" and row[i+1] == "R":col = "B"
            elif row[i]== "G" and row[i+1] == "B":col = "R"
            elif row[i]== "B" and row[i+1] == "G":col = "R"
            elif row[i]== "B" and row[i+1] == "R":col = "G"
            elif row[i]== "R" and row[i+1] == "B":col = "G"
            elif row[i]==row[i+1]:col =row[i]
            temp =temp+col
        row=temp
    return row