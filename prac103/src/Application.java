       public class Application {
            public static void main(String[] args) {
                // Создаем фабрики для каждого типа документов
                ICreateDocument textFactory = new TextDocumentFactory();
                ICreateDocument imageFactory = new ImageDocumentFactory();
                ICreateDocument musicFactory = new MusicDocumentFactory();

                // Создаем новые документы
                IDocument newTextDocument = textFactory.createNew();
                IDocument newImageDocument = imageFactory.createNew();
                IDocument newMusicDocument = musicFactory.createNew();

                // Открываем эти документы (демонстрация работы метода open)
                newTextDocument.open();
                newImageDocument.open();
                newMusicDocument.open();

                // Сохраняем документы (демонстрация работы метода save)
                newTextDocument.save();
                newImageDocument.save();
                newMusicDocument.save();

                // Закрываем документы (демонстрация работы метода close)
                newTextDocument.close();
                newImageDocument.close();
                newMusicDocument.close();

                // Предположим, что у нас есть пути к существующим файлам
                String textFilePath = "1.txt";
                String imageFilePath = "1.jpg";
                String musicFilePath = "/Users/po_scripty/Documents/INTELJIDEA/JAVAPROG/prac103/src/1.mp3";

                // Открываем существующие документы
                IDocument existingTextDocument = textFactory.createOpen(textFilePath);
                IDocument existingImageDocument = imageFactory.createOpen(imageFilePath);
                IDocument existingMusicDocument = musicFactory.createOpen(musicFilePath);

                // Просто демонстрируем сообщения об открытии существующих файлов
                existingTextDocument.openFile(textFilePath);
                existingImageDocument.openFile(imageFilePath);
                existingMusicDocument.openFile(musicFilePath);
            }
        }
