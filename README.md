# AF_POO

🚀 Principais comandos Git
📌 Configuração

git config --global user.name "Seu Nome"
Define seu nome no Git (importante pro histórico).

git config --global user.email "seuemail@email.com"
Define seu email.

📂 Trabalhando com repositórios

git init
Cria um repositório Git dentro da pasta atual.

git clone URL_DO_REPO
Baixa um repositório remoto para sua máquina.

📄 Adicionar e confirmar mudanças

git status
Mostra o que mudou, o que está pronto pra commit e o que não está.

git add .
Adiciona todas as mudanças para serem commitadas.

git add nome_do_arquivo
Adiciona um arquivo específico.

git commit -m "mensagem"
Registra as mudanças com uma mensagem.

🔄️ Branches

git branch
Lista as branches existentes.

git branch nome-da-branch
Cria uma branch nova.

git checkout nome-da-branch
Troca para outra branch.

git switch nome-da-branch
Mesma ideia do checkout, mas mais moderno.

git checkout -b nome-da-branch
Cria e troca pra branch na mesma hora.

🔀 Merge e Rebase

git merge nome-da-branch
Junta outra branch com a branch atual.

git rebase nome-da-branch
Reorganiza o histórico (mais avançado — cuidado 😅).

🌐 Conectar com repositório remoto

git remote -v
Mostra os remotos conectados (geralmente origin).

git remote add origin URL
Conecta sua pasta a um repositório remoto.

⬆️⬇️ Enviar e receber alterações

git pull
Baixa mudanças do repositório remoto e aplica no seu código.

git fetch
Baixa mudanças do remoto sem misturar com seu código (mais seguro).

git push
Envia seus commits para o repositório remoto.

git push -u origin nome-da-branch
Primeira vez enviando uma branch nova.

🧼 Desfazer coisas

git restore nome-do-arquivo
Desfaz mudanças não adicionadas (antes de add).

git reset nome-do-arquivo
Tira o arquivo da área de staging (depois do add).

git reset --soft HEAD~1
Volta um commit mas mantém as alterações.

git reset --hard HEAD~1
Volta um commit e apaga tudo (cuidado ⚠️).

🕵️ Histórico

git log
Mostra o histórico de commits.

git log --oneline
Histórico resumido (bem útil).