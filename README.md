# Projeto de Cálculo de Área

Este projeto em Java contém uma classe utilitária para o cálculo da área de um retângulo, utilizando boas práticas de documentação com Javadoc.

## 📁 Estrutura do Projeto

```
calcArea/
├── CalculaArea.java
├── CalcArea.java
├── docs/ (gerado automaticamente)
└── README.md
```

## ▶️ Como compilar e executar

```bash
javac CalculaArea.java CalcArea.java
java CalcArea
```

## 📄 Como gerar a documentação Javadoc

1. Abra o terminal no diretório raiz do projeto.
2. Execute o comando:

```bash
javadoc -d docs *.java
```

3. A documentação será gerada na pasta `docs/`.

## 🌐 Como visualizar a documentação

Abra o arquivo `docs/index.html` com qualquer navegador web. Por exemplo, no Linux com interface gráfica, use:

```bash
xdg-open docs/index.html
```

Ou clique duas vezes no arquivo pelo gerenciador de arquivos.

---

## 👨‍💻 Autor

- Rafael Lopes

## 📌 Observações

- Este projeto é para fins de aprendizagem de Java e uso do Javadoc.
- Requer JDK 11 ou superior instalado.
