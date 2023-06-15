import pandas as pd
import sqlite3
spreadsheet_0 = pd.read_csv(r'E:\GIT\forage-walmart-task-4\data\shipping_data_0.csv')
spreadsheet_1 = pd.read_csv(r'E:\GIT\forage-walmart-task-4\data\shipping_data_1.csv')
spreadsheet_2 = pd.read_csv(r'E:\GIT\forage-walmart-task-4\data\shipping_data_2.csv')

connect = sqlite3.connect(r'E:\GIT\forage-walmart-task-4\shipment_database.db')
cursor = connect.cursor()

spreadsheet_0.to_sql('Table0', connect, if_exists='replace', index=False)

cursor.execute('''
    CREATE TABLE IF NOT EXISTS table1 (
        shipment_id INTEGER,
        origin_warehouse TEXT,
        destination_store TEXT,
        driver_identifier TEXT,
        product TEXT,
        on_time INTEGER
    )
''')

processed_data = []
for row1 in spreadsheet_1.itertuples():
    shipping_id = row1.shipment_identifier
    product = row1.product
    on_time = row1.on_time

    origin_row = spreadsheet_2.loc[spreadsheet_2['shipment_identifier'] == shipping_id]
    if len(origin_row) > 0:
        origin_warehouse = origin_row.iloc[0]['origin_warehouse']
        destination_store = origin_row.iloc[0]['destination_store']
        driver_identifier = origin_row.iloc[0]['driver_identifier']
        processed_data.append((shipping_id, origin_warehouse, destination_store, driver_identifier, product, on_time))
cursor.executemany("INSERT INTO table1 VALUES (?, ?, ?, ?, ?, ?)", processed_data)

# Retrieve data from table1
cursor.execute("SELECT * FROM table0")
table0_data = cursor.fetchall()
print("Data in table0:")
for row in table0_data:
    print(row)

# Retrieve data from table1
cursor.execute("SELECT * FROM table1")
table1_data = cursor.fetchall()
print("Data in table1:")
for row in table1_data:
    print(row)
connect.commit()
connect.close()