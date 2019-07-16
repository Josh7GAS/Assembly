#!/usr/bin/python3

from zabbix_api import ZabbixAPI

URL = 'http://10.0.0.11/zabbix'
username = 'Admin'
password = 'zabbix'

try:
    zapi = ZabbixAPI (URL, timeout=180)
    zapi.login(username, password)
    print('Conectando na API do Zabbix, versao: {}'.format(zapi.api_version()))
except Exception as err:
    print('Falha ao conectar na API do Zabbix')
    print('Erro'.format(err))