from django.shortcuts import render, redirect
from django.http import JsonResponse
from django.core.mail import send_mail
import json
from .form import DenunciaForm
from .models import Denuncia

def nova_denuncia(request):
    if request.method == 'POST':
        form = DenunciaForm(request.POST)
        if form.is_valid():
            denuncia = form.save()
            return render(request, 'core/sucesso.html', {'token': denuncia.token})
    else:
        form = DenunciaForm()
    return render(request, 'core/form.html', {'form': form})

def verificar_status(request):
    token = request.GET.get('token')
    denuncia = None

    if token:
        try:
            denuncia = Denuncia.objects.get(token=token)
        except Denuncia.DoesNotExist:
            denuncia = None

    return render(request, 'core/status.html', {'denuncia': denuncia})
