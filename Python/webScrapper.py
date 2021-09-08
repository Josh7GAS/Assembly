import requests

URL = 'https://automatetheboringstuff.com/'

page = requests.get(URL)

print(page.content())
