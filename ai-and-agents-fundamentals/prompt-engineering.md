# Engenharia de Prompts e Funcionamento dos LLMs

Guia prático e conciso sobre o funcionamento interno de modelos de linguagem (LLMs), a estrutura ideal de um prompt e os principais cuidados no uso de IAs generativas.

---

## 1. Como os Modelos de Linguagem Funcionam

### Processamento de Entrada (Tokenização)
Os modelos de linguagem não leem palavras completas como humanos. Eles dividem o texto em unidades menores chamadas **tokens** (que podem ser palavras, sílabas ou caracteres).
* A partir dos tokens, o modelo calcula relações matemáticas e estatísticas para prever a sequência de texto mais provável a ser gerada.

### Janela de Contexto (Memória do Modelo)
A memória de trabalho de um LLM funciona quase como uma **lousa com limite de espaço**:
* Existe uma quantidade máxima de tokens que o modelo consegue processar de uma só vez (janela de contexto).
* Quando a conversa atinge o limite do contexto, o sistema precisa descartar as informações mais antigas para liberar espaço para novas entradas.

---

## 2. Anatomia de um Bom Prompt

Para obter respostas precisas e de alta qualidade de um LLM, o prompt deve conter os seguintes elementos:

| Elemento | Descrição | Exemplo |
| :--- | :--- | :--- |
| **Instrução Direta** | O que a IA deve fazer claramente. | *"Resuma o texto a seguir..."* |
| **Contexto** | O cenário ou papel que a IA deve assumir. | *"Atue como um desenvolvedor Senior..."* |
| **Exemplos (Few-Shot)** | Amostras do formato ou estilo esperado. | *"Entrada: X -> Saída: Y"* |
| **Dados de Entrada** | O conteúdo que deve ser processado. | O código, artigo ou tabela a ser analisada. |
| **Formato de Saída** | A estrutura desejada para a resposta. | *"Retorne em formato de lista Markdown."* |

---

## 3. Cuidados e Riscos no Uso de Prompts

* 🔒 **Segurança e Privacidade:** Evite enviar dados sensíveis, senhas, chaves de API ou informações confidenciais para modelos de IA públicos.
* 🌀 **Alucinações:** Modelos de linguagem priorizam a coerência textual e podem inventar fatos, citações ou soluções com um tom extremamente convincente. Sempre valide as informações críticas.
* 🤝 **Viés de Confirmação (*Sycophancy*):** A IA é treinada para agradar o usuário. Se você induzir no prompt que uma ideia está correta, a IA tenderá a concordar com você, mesmo que a premissa seja falsa.