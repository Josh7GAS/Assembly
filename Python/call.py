from twilio.rest import Client


account_sid = "AC64d8f879844f1c7048eaa8c84bd3f958"
auth_token = "1ac721befb7213ffa037e60b48af95d6"

numero_client = "+5511966112472"
numero_server = "+12723597092"

client = Client(account_sid, auth_token)

message = """
<Response>
<Say language= "pt-BR">
Olá Senhora aqui é a Renner e gostariamos de notificar que seu nome está indo para o serasa devido a uma dívida atrasado conosco no ano de 2015, para mais informações entre em contato com alguma loja.
</Say>
</Response>
"""

call = client.calls.create(
        to = numero_client,
        from_ = numero_server,
        twiml = message
)
