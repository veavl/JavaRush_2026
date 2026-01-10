# Руководство по работе с Git

## Первоначальная настройка Git

### Настройка имени и email
```bash
git config --global user.name "Ваше Имя"
git config --global user.email "ваш.email@example.com"
```

**Важно:**
- Email должен совпадать с email на GitHub/GitLab
- Имя может быть любым
- Эти настройки глобальные для всех репозиториев

### Проверка настроек
```bash
git config --global user.name
git config --global user.email
```

---

## Создание локального репозитория

### Инициализация репозитория
```bash
cd путь/к/проекту
git init
```

Создает папку `.git` и инициализирует репозиторий.

---

## Работа с файлами

### Проверка статуса
```bash
git status
```
Показывает, какие файлы изменены, добавлены или удалены.

### Добавление файлов в staging area
```bash
# Добавить все файлы
git add .

# Добавить конкретные файлы/папки
git add путь/к/файлу
git add src/
git add .gitignore
```

### Создание коммита
```bash
git commit -m "Описание ваших изменений"
```

Примеры:
```bash
git commit -m "Initial commit"
git commit -m "Добавлена новая функциональность"
git commit -m "Исправлена ошибка"
```

---

## Работа с удаленным репозиторием

### Проверка подключенных репозиториев
```bash
git remote -v
```
Показывает список удаленных репозиториев (обычно `origin`).

### Подключение удаленного репозитория
```bash
git remote add origin https://github.com/ваш-username/название-репозитория.git
```

### Получение файлов с GitHub

**Если локальный и удаленный репозитории созданы независимо:**
```bash
git pull origin master --allow-unrelated-histories
```
или
```bash
git pull origin main --allow-unrelated-histories
```

Флаг `--allow-unrelated-histories` нужен, когда:
- Локальный репозиторий создан на одном ПК
- Удаленный репозиторий создан на другом ПК
- Это две независимые истории коммитов

**Если репозиторий уже существует:**
```bash
git pull origin master
```

### Загрузка изменений на GitHub
```bash
# Для ветки master
git push origin master

# Для ветки main
git push origin main

# При первой загрузке новой ветки
git push -u origin master
```

Флаг `-u` (или `--set-upstream`) связывает локальную ветку с удаленной.

---

## Разрешение конфликтов

### Когда возникают конфликты
- Один и тот же файл изменен и локально, и на GitHub
- При выполнении `git pull` или `git merge`

### Как разрешить конфликты

**1. Посмотреть список конфликтующих файлов:**
```bash
git status
```

**2. Открыть файлы с конфликтами**

Git помечает конфликтующие участки:
```
<<<<<<< HEAD
Ваш локальный код
=======
Код с GitHub
>>>>>>> master
```

**3. Разрешить конфликты:**

**Вариант А: Принять версию с GitHub (удаленной)**
```bash
git checkout --theirs .
git add .
git commit -m "Принята версия с GitHub"
```

**Вариант Б: Оставить локальную версию**
```bash
git checkout --ours .
git add .
git commit -m "Оставлена локальная версия"
```

**Вариант В: Объединить вручную**
- Открыть файлы в редакторе
- Удалить маркеры (`<<<<<<<`, `=======`, `>>>>>>>`)
- Оставить нужные части кода
- Сохранить файлы
```bash
git add .
git commit -m "Объединение изменений"
```

**4. Загрузить результат:**
```bash
git push origin master
```

---

## Работа с ветками

### Проверка текущей ветки
```bash
git branch
```
Показывает все локальные ветки. Активная помечена звездочкой `*`.

### Создание новой ветки
```bash
git checkout -b название-новой-ветки
```

### Переключение между ветками
```bash
git checkout название-ветки
```

### Переименование ветки
```bash
# Переименовать локальную ветку
git branch -m старое-название новое-название

# Пример: переименовать master в main
git branch -m master main
```

---

## Клонирование репозитория

### Клонирование существующего репозитория
```bash
git clone https://github.com/ваш-username/название-репозитория.git
```

### Клонирование в текущую папку
```bash
git clone https://github.com/ваш-username/название-репозитория.git .
```
Точка в конце означает клонировать в текущую директорию.

---

## Полезные команды

### Просмотр истории коммитов
```bash
git log
```

### Обновление локальной ветки перед push
```bash
git pull origin master
```

### Проверка версии Git
```bash
git --version
```

---

## Предупреждения и их решение

### Предупреждение о LF/CRLF
```
warning: in the working copy of 'file.txt', LF will be replaced by CRLF
```

**Решение:**
```bash
git config --global core.autocrlf true
```

Это нормально для Windows. Git автоматически конвертирует окончания строк.

### Ошибка "fatal: couldn't find remote ref main"
Ветка `main` не найдена. Проверьте название ветки:
```bash
git branch -r  # Показать удаленные ветки
```

Используйте правильное название:
```bash
git pull origin master  # Если ветка называется master
```

---

## Типичные сценарии

### Сценарий 1: Первый раз на новом ПК
1. Настроить Git:
   ```bash
   git config --global user.name "Ваше Имя"
   git config --global user.email "ваш.email@example.com"
   ```

2. Клонировать репозиторий:
   ```bash
   git clone https://github.com/ваш-username/репозиторий.git
   ```

### Сценарий 2: Локальный репозиторий + удаленный репозиторий
1. Создать локальный репозиторий:
   ```bash
   git init
   git add .
   git commit -m "Initial commit"
   ```

2. Подключить удаленный репозиторий:
   ```bash
   git remote add origin https://github.com/ваш-username/репозиторий.git
   ```

3. Получить файлы с GitHub:
   ```bash
   git pull origin master --allow-unrelated-histories
   ```

4. Разрешить конфликты (если есть)

5. Загрузить на GitHub:
   ```bash
   git push -u origin master
   ```

### Сценарий 3: Работа с существующим репозиторием
1. Обновить локальную версию:
   ```bash
   git pull origin master
   ```

2. Внести изменения, добавить и закоммитить:
   ```bash
   git add .
   git commit -m "Описание изменений"
   ```

3. Загрузить на GitHub:
   ```bash
   git push origin master
   ```

---

## Ветки: master vs main

- **master** — старое название главной ветки
- **main** — современный стандарт (GitHub, GitLab используют main)

**Важно:** При работе с репозиторием используйте то название ветки, которое есть на GitHub:
- Если на GitHub `master` → используйте `master`
- Если на GitHub `main` → используйте `main`

Проверить можно на GitHub или командой:
```bash
git branch -r
```

