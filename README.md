# 💱 Conversor de Moedas

Projeto em Java que realiza conversões de moedas em tempo real, utilizando a API [ExchangeRate](https://www.exchangerate-api.com/). A aplicação interage com o usuário via console e oferece várias opções de conversão entre moedas da América do Sul e o Dólar americano.

---

## 📌 Funcionalidades

- ✅ Conversão entre:
  - Dólar ↔ Peso Argentino
  - Dólar ↔ Real Brasileiro
  - Dólar ↔ Peso Colombiano
- ✅ Entrada interativa via terminal
- ✅ Consumo de API com valores atualizados em tempo real
- ✅ Desserialização JSON com Gson
- ✅ Estrutura modular e com boas práticas

---

## 📁 Estrutura do Projeto

conversor-moeda/
├── src/
│ └── br/com/alura/conversormoeda/
│ ├── principal.java
│ ├── Menu.java
│ ├── MoedaService.java
│ └── ConversaoResponse.java
└── lib/
└── gson-2.10.1.jar

yaml
Copiar
Editar

---

## ▶️ Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seuusuario/conversor-moeda.git
Abra no IntelliJ IDEA

Adicione o .jar do Gson em:

arduino
Copiar
Editar
File > Project Structure > Libraries
Execute a classe principal.java

🔑 API Key
Você precisa de uma chave da ExchangeRate API:

Crie uma conta gratuita

Copie sua chave

Substitua a constante API_KEY na classe MoedaService

🛠️ Tecnologias
Java 17+

IntelliJ IDEA

Gson (Google JSON)

API ExchangeRate

