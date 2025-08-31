# 🐸 FrogRun

Simulação de uma corrida de sapos com 5 threads, onde cada thread controla um sapo que dá saltos aleatórios até completar a distância da corrida.

## 🎯 Funcionalidades

- 5 sapos competindo simultaneamente em threads separadas
- Saltos aleatórios com tamanho máximo configurável
- Narração em tempo real de cada salto
- Sistema de colocação que mostra a ordem de chegada
- Distância máxima personalizável para a corrida

## 🚀 Como executar

### Pré-requisitos
- JDK 8 ou superior
- Git instalado

### Passo a passo
1. Clone o repositório:
```bash
git clone https://github.com/GabrielGit10110/CorridaSapos.git
```

2. Acesse o diretório do projeto:
```bash
cd CorridaSapos
```

3. Compile o código:
```bash
javac -d bin src/*.java
```

4. Execute a aplicação:
```bash
java -cp bin Main
```

## ⚙️ Configurações
- **Distância máxima**: 100 metros
- **Tamanho máximo do salto**: 10 metros
- **Número de sapos**: 5

## 🛠️ Tecnologias utilizadas
- Java SE
- Programação multithread
- Geração de números aleatórios
- Sincronização de threads
- JDK 8+

## 📋 Exemplo de saída
```
Sapo n° 2 deu um salto de 44m e percorreu 44m
Sapo n° 3 deu um salto de 46m e percorreu 46m
Sapo n° 1 deu um salto de 4m e percorreu 4m
Sapo n° 5 deu um salto de 35m e percorreu 35m
Sapo n° 4 deu um salto de 27m e percorreu 27m

... [saltos continuam] ...

Sapo n° 2 terminou a corrida na 1° posicao 

Sapo n° 3 terminou a corrida na 2° posicao 

Sapo n° 5 terminou a corrida na 3° posicao 

Sapo n° 4 terminou a corrida na 4° posicao 

Sapo n° 1 terminou a corrida na 5° posicao 
```

## 👨‍💻 Desenvolvido por
[GabrielGit10110](https://github.com/GabrielGit10110)
