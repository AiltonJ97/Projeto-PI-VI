from django.contrib import admin
from django.urls import path
from core import views

urlpatterns = [
    path('admin/', admin.site.urls),
    path('', views.nova_denuncia, name='nova'),
    path('status/', views.verificar_status, name='status'),

]
