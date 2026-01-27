import pandas as pd

df = pd.read_excel("people.xlsx")

print(f"Rows: {df.shape[0]}; Columns: {df.shape[1]}")
print (df['Email'])
df = df.sort_values("FirstName")
print(df)
