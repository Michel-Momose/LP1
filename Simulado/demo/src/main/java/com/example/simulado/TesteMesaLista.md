### Teste de Mesa - Algoritmo de Busca em Lista

#### Dados Iniciais:
- Lista[10] = {4, 8, 12, 6, 3, 9, 7, 11, 2, 5}
- Item a ser procurado: 7

#### Passos do Algoritmo:
1. **Preenchimento da lista:**
   - Digite o item 1 da lista: 4
   - Digite o item 2 da lista: 8
   - Digite o item 3 da lista: 12
   - Digite o item 4 da lista: 6
   - Digite o item 5 da lista: 3
   - Digite o item 6 da lista: 9
   - Digite o item 7 da lista: 7
   - Digite o item 8 da lista: 11
   - Digite o item 9 da lista: 2
   - Digite o item 10 da lista: 5

2. **Item a ser procurado:** 7

3. **Procura na lista:**
   - Iteração 1: lista[0] = 4 ≠ 7 (achou = FALSO)
   - Iteração 2: lista[1] = 8 ≠ 7 (achou = FALSO)
   - Iteração 3: lista[2] = 12 ≠ 7 (achou = FALSO)
   - Iteração 4: lista[3] = 6 ≠ 7 (achou = FALSO)
   - Iteração 5: lista[4] = 3 ≠ 7 (achou = FALSO)
   - Iteração 6: lista[5] = 9 ≠ 7 (achou = FALSO)
   - Iteração 7: lista[6] = 7 = 7 (achou = VERDADEIRO)
     - O algoritmo interrompe a busca quando encontra o item 7.

4. **Saída:** "7 encontrado na posição 7"
