
make-dist: # создание дистрибутива для запуска
	#gradle clean
	gradle installDist

run-dist: # запуск скомпилированного приложения на bash
	./build/install/app/bin/app

run-dist-win: # запуск скомпилированного приложения для windows
	./build/install/app/bin/app.bat