# Lista 01 – Questões teóricas (itens 1 a 6)

## 1) Expressões na sintaxe do Português Estruturado
Obs.: o PDF extraiu algumas fórmulas sem os símbolos matemáticos; as respostas abaixo seguem a forma usual de cada expressão.
- A. `a + b / 3`  (se a fórmula for (a+b)/3: `(a + b) / 3`)
- B. `43 * (55 / (30 + 2 * alfa))`
- C. `2 * x ^ 2 - 3 * x * (x + 1) + x + 1`
- D. `45 / (2 * h) - 2 / (3 * h) - 4 * h * (3 - h)`
- E. `(-6 * x + 2 * y) / 3 / w`
- F. `(-b + raizq(b ^ 2 - 4 * a * c)) / (2 * a)`  e  `(-b - raizq(b ^ 2 - 4 * a * c)) / (2 * a)`  (o símbolo ± gera as duas raízes)

## 2) Expressões na forma convencional
- A. a + b + ( (34 + 9e) / u − √89 )
- B. 12 + 1 / √(4a / 45)
- C. ((a + x)^(2+w) − 3a) / 2
- D. 12x / (36 − 9^y)
- E. (−5 + 96x − √(w − 1))^(1/y)

## 3) Tipos (I inteiro, R real, L lógico, C literal)
a. 0 → **I**   b. Verdadeiro → **L**   c. "Falso" → **C**
d. 5.7 → **R**   e. 45.8976 → **R**   f. -678 → **I**
g. "cinco" → **C**   h. "443" → **C**   i. Falso → **L**
j. "0" → **C**   k. "Casa 8" → **C**   l. 34 → **I**

## 4) Nomes de variáveis válidos (X = válido)
a. abc **X** | b. Verdadeiro (palavra reservada/literal lógico) ✗ | c. 21brasil (começa com número) ✗
d. guarda-chuva (hífen) ✗ | e. etc. (ponto) ✗ | f. zero **X**
g. guarda_chuva **X** | h. leia (palavra reservada) ✗ | i. nome*usuario (asterisco) ✗
j. #fone (#) ✗ | k. Casa 8 (espaço) ✗ | l. endereco **X**
m. "cinco" (aspas) ✗ | n. falso (palavra reservada) ✗ | o. _falso (em Portugol/Visualg não pode começar com `_`; em Java seria válido) ✗

## 5) Erros no programa
1. `Maria` é declarada duas vezes (como `caracter` e como `real`): declaração duplicada.
2. `idade <- letra`: `letra` não foi declarada (a variável se chama `letras`) e, mesmo que existisse, seria literal atribuído a inteiro.
3. `letras <- 2`: atribui um inteiro a uma variável `caracter` (tipos incompatíveis).
4. (`idade <- 678` é válido; só sobrescreve o valor de 23.)

## 6) Diferença entre as atribuições
- a) `Letra <- "A"` guarda o **texto** A (literal entre aspas) na variável Letra.
- b) `Letra <- A` copia para Letra o **conteúdo da variável A** (que precisa existir e ter tipo compatível).
O mesmo vale para `Nome <- "Joao"` (texto) e `Nome <- Joao` (conteúdo da variável Joao).
