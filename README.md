
# **IMC Calculator App**

> Um aplicativo Android simples de lista de compras, desenvolvido para facilitar o processo de seleção e totalização dos produtos que você deseja adquirir.
Corporal (IMC).

## 📱 Descrição

Com uma interface intuitiva, você pode marcar os itens que pretende comprar utilizando checkboxes,
e ao clicar no botão "Total das compras", o aplicativo calculará automaticamente o valor total dos produtos selecionados.

## 🔧 Funcionalidades

- [x] Seleção de Produtos: Marque os produtos que deseja incluir na sua compra.
- [x] Cálculo de Total: Um botão para calcular e exibir o total dos itens selecionados em uma janela de diálogo.
- [x] Interface Amigável: Layout limpo e fácil de usar, permitindo uma navegação rápida e prática.

## 🚀 Tecnologias Utilizadas

- [x] **Android Studio** (Koala | 2024.1.2).
- [x] **Java** para desenvolvimento.
- [x] **ConstraintLayout** para interface responsiva.
- [x] **TextView** para a exibição de dados.
- [x] **Button**   para executar o app.
- [X] **Checkbox** para selecionar os itens. 

## 🛠️ Como Rodar o Projeto

Siga os passos abaixo para rodar o projeto localmente:

1. Clone este repositório:

    ```bash
    git clone https://github.com/Andriele15/App-Compras.git

    ```

2. Abra o projeto no Android Studio.
3. Compile e execute o projeto em um emulador ou dispositivo físico.

## 📂 Estrutura do Projeto
```bash
├── app
│ ├── src
│ │ ├── main
│ │ │ ├── java/br/ulbra/aplicacaodecompras
│ │ │ │ ├── MainActivity.java # Atividade principal 
│ │ │ ├── res
│ │ │ │ ├── layout
│ │ │ │ │ ├── activity_main.xml # Layout da tela principal
│ │ │ │ └── values
│ │ │ │ ├── strings.xml # Strings usadas no app
│ │ │ │ ├── colors.xml # Cores definidas no projeto
│ └── build.gradle # Configuração do Gradle
└── README.md # Este arquivo
```

 
 ## 🖥️ Telas do Aplicativo

1. **Tela Principal**
 
Na tela principal, o usuário seleciona algum dos itens da checkbox ( Arroz (R$ 2,69), Leite (R$ 5,00), Carne (R$ 10,00), Feijão (R$ 2,30), Refrigerante Coca-Cola (R$ 2,00) ), 
e apertando no button "Total das compras" irá ser devolvida em uma caixa de diálogo o resultado da soma dos itens.
 
![listadecompras](https://github.com/user-attachments/assets/a99b79c1-9a1e-4de8-8620-f9f125a31615)
 
## 👨‍💻 Desenvolvedores –

**Andriele Pacheco** - Desenvolvedor - [GitHub](https://github.com/Andriele15)
 
 ## 📄 Licença MIT
 
Este projeto está licenciado sob os termos da licença MIT. 
Para mais
detalhes, veja o arquivo [LICENSE](LICENSE).
