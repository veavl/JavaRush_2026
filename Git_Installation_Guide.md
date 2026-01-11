# Руководство по установке Git для Windows

## Шаг 1: Скачивание Git

1. Перейдите на [git-scm.com](https://git-scm.com/download/win)
2. Скачайте **Git for Windows/x64 Setup** (для большинства компьютеров)
3. Запустите установщик

## Шаг 2: Выбор компонентов (Select Components)

### Рекомендуемые настройки:

✅ **Оставить включенными:**
- **Windows Explorer integration** — удобный доступ через контекстное меню
- **Associate .git* configuration files with the default text editor** — удобное открытие конфигов
- **Add a Git Bash Profile to Windows Terminal** — если используете Windows Terminal

❌ **Можно отключить:**
- **Additional icons → On the Desktop** — иконка на рабочем столе (необязательно)
- **Check daily for Git for Windows updates** — автоматическая проверка обновлений
- **Git LFS (Large File Support)** — только если работаете с очень большими файлами
- **Scalar** — только для очень больших репозиториев (Microsoft, Google и т.п.)

## Шаг 3: Имя начальной ветки (Adjusting the name of the initial branch)

**Рекомендация:** Выбрать **"Override the default branch name for new repositories"** и указать `main`

- `main` — современный стандарт (используется GitHub, GitLab)
- `master` — устаревшее название
- ⚠️ **Важно:** Это не влияет на существующие репозитории, только на новые

## Шаг 4: Настройка PATH (Adjusting your PATH environment)

**Рекомендация:** Оставить **"Git from the command line and also from 3rd-party software"** (рекомендуется)

- Git будет работать в PowerShell, CMD, Git Bash и Windows Terminal
- Будет работать в IDE (IntelliJ IDEA, VS Code и т.д.)
- Не затронет системные команды Windows

## Шаг 5: Выбор SSH-клиента (Choosing the SSH executable)

**Рекомендация:** Оставить **"Use bundled OpenSSH"**

- Работает сразу после установки
- Не требует дополнительных настроек
- Подходит для работы с GitHub/GitLab

## Шаг 6: HTTPS транспорт (Choosing HTTPS transport backend)

**Рекомендация:** Оставить **"Use the native Windows Secure Channel library"**

- Лучше интегрируется с Windows
- Использует системные сертификаты Windows
- Удобно в корпоративных сетях (Active Directory)

## Шаг 7: Терминальный эмулятор (Configuring the terminal emulator)

**Рекомендация:** Оставить **"Use MinTTY (the default terminal of MSYS2)"**

- Современный интерфейс с удобной прокруткой
- Поддержка Unicode из коробки
- Непрямоугольное выделение текста

⚠️ **Примечание:** Некоторые интерактивные программы (Python, Node.js) нужно запускать через `winpty`:
```bash
winpty python
winpty node
```

## Шаг 8: Credential Helper (Choose a credential helper)

**Рекомендация:** Оставить **"Git Credential Manager"**

- Сохраняет логины и пароли/токены
- Не нужно вводить пароль каждый раз
- Безопасное хранение в Windows
- Работает с GitHub, GitLab, Bitbucket

## Первоначальная настройка Git

После установки настройте имя и email:

```bash
git config --global user.name "Ваше Имя"
git config --global user.email "ваш.email@example.com"
```

## Проверка установки

```bash
git --version
```

Должно показать версию (например, `git version 2.52.0`)


