
build: # создание дистрибутива для запуска
	gradle clean
	gradle installDist

run: # запуск скомпилированного приложения на bash
	./build/install/app/bin/app

run-win: # запуск скомпилированного приложения для windows
	./build/install/app/bin/app.bat