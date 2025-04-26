import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
    }

    /*
     * Don't see below
     */

    static Reader sc = new Reader();
    static StringBuilder sb = new StringBuilder();
    static Random rd = new Random();

    static class Reader {
        private int BUFFER_SIZE = 1 << 16;
        private byte[] buffer = new byte[BUFFER_SIZE];
        private int bufferPointer = 0, bytesRead = 0;
        private InputStream rd;

        public Reader() {
            this.rd = System.in;
        }

        public Reader(String nameFile) {
            try {
                this.rd = new FileInputStream(nameFile);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public void close() {
            try {
                rd.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private byte read() {
            if (bufferPointer == bytesRead) {
                bufferPointer = 0;
                try {
                    bytesRead = rd.read(buffer, bufferPointer, BUFFER_SIZE);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (bytesRead == -1) {
                    return -1;
                }
            }
            return buffer[bufferPointer++];
        }

        public int nextInt() {
            int number = 0;
            int c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean negative = (c == '-');
            if (negative) {
                c = read();
            }
            do {
                number = number * 10 + (c - '0');
                c = read();
            } while (c >= '0' && c <= '9');
            return negative ? -number : number;
        }

        public long nextLong() {
            long number = 0L;
            int c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean negative = (c == '-');
            if (negative) {
                c = read();
            }
            do {
                number = number * 10 + (c - '0');
                c = read();
            } while (c >= '0' && c <= '9');
            return negative ? -number : number;
        }

        public String next() {
            int c = read();
            while (c <= ' ') {
                c = read();
            }
            StringBuilder t = new StringBuilder();
            do {
                t.append((char) c);
                c = read();
            } while (c > ' ');
            return t.toString();
        }

        public String nextLine() {
            int c = read();
            while (c == '\n' || c == '\r') {
                c = read();
            }
            StringBuilder t = new StringBuilder();
            while (c != '\n' && c != '\r' && c != -1) {
                t.append((char) c);
                c = read();
            }
            return t.toString();
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public char nextChar() {
            int c = read();
            while (c <= ' ') {
                c = read();
            }
            return (char) c;
        }
    }

    static class Writer {
        private final String nameFile;
        private final StringBuilder sb;

        public Writer() {
            this.nameFile = null;
            sb = new StringBuilder();
        }

        public Writer(String nameFile) {
            this.nameFile = nameFile;
            sb = new StringBuilder();
        }

        public Writer append(Object s) {
            sb.append(s);
            return this;
        }

        public void print() {
            if (nameFile == null) {
                try {
                    System.out.write(sb.toString().getBytes());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    File file = new File(nameFile);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    try (FileOutputStream fos = new FileOutputStream(file)) {
                        fos.write(sb.toString().getBytes());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override
        public String toString() {
            return sb.toString();
        }
    }

}
