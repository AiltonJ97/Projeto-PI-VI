from django.db import models
import uuid

STATUS_CHOICES = (
    ('andamento', 'Em andamento'),
    ('analise', 'Em análise'),
    ('processo', 'Em processo'),
    ('finalizado', 'Finalizado'),
)

def gerar_token():
    return uuid.uuid4().hex[:10]

class Denuncia(models.Model):
    token = models.CharField(max_length=20, unique=True, default=gerar_token)
    nome = models.CharField(max_length=100, blank=True, null=True)
    email = models.EmailField(blank=True, null=True)
    empresa = models.CharField(max_length=150)
    descricao = models.TextField()
    status = models.CharField(max_length=20, choices=STATUS_CHOICES, default='andamento')
    criado_em = models.DateTimeField(auto_now_add=True)

    def __str__(self):
        return f"Denúncia {self.token}"
