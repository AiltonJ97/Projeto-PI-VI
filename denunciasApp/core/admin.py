from django.contrib import admin
from .models import Denuncia

@admin.register(Denuncia)
class DenunciaAdmin(admin.ModelAdmin):
    list_display = ('empresa', 'token', 'status', 'criado_em')
    list_filter = ('status', 'empresa')
    search_fields = ('token', 'empresa')
    readonly_fields = ('token', 'criado_em')
