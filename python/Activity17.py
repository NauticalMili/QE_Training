import pandas as pd
import numpy as np

data = {'Usernames': ['admin', 'Charles', 'Deku'], 
        'Passwords': ['password', 'Charl13', 'AllMight']}
df = pd.DataFrame(data)

df.to_csv('./people.csv', index=False)
