# miyazaki

- 005 ユーザーとの会話
ユーザーとの会話を開始する。最初にユーザーに名前を入力させ、次に入力された名前を使って、"こんにちは、◯◯さん"と表示する。その後、ユーザーに好きな食べ物を入力させ、"◯◯さんの好きな食べ物は△△ですね"と表示する。食べ物を複数入力できるようにすること。食べ物が2つ以上なら、「好きな食べ物は△△と、△△と、△△ですね」のように表示する。ひとつも入力しなかったら、好きな食べ物のことは表示しない。

- 実例１
  -  入力　みやざきりゅうせい
  -  出力　こんにちは、みやざきりゅうせいさん

  -  入力　たこ焼き
  -  出力　みやざきりゅうせいさんの好きな食べ物はたこ焼きですね

- 実例２
  -  入力　魔人ブウ
  - 出力　こんにちは、魔人ブウさん

  - 入力　チョコレート　キャンディー　アイスクリーム
  - 出力　魔人ブウさんの好きな食べ物はチョコレートと、キャンディーと、アイスクリームですね

- 準備作業
  - 入力
    - 名前を入力する
  - 処理
    - 出力文字列を作る
  - 出力 
    - 文字列を表示する
  - 入力
    - 食べ物を入力する
  - 処理
    - 出力文字列を作る
  - 出力
    - 文字列を表示する
  - 動作確認

↓↓↓↓↓↓

- 準備作業
  -　ファイルを作る
    - パッケージを決める
    - hello.javaを作る
  - クラスを作る
    - helloクラスを作る
    - 空のmain()メソッドを作る
- 入力
  - 名前を入力する
    - scannerを作る
      - インポートする
      - System.inを渡してnewする
      - 変数scannerに格納する
    - scanner.nextLine()で名前を入力する
    - 変数nameに格納する
      - 返り値を変数nameに格納する
    - println()でnameを表示して動作確認
      - syso("name="+name)
 - 処理
   -出力文字列を作る
      - sysoで"名前を記入してください。"と表示
        - println()でyobinaを表示して動作確認
        - sysoで("yobina="+yobina)
     
  - 出力
    - 文字列を表示する 
      - sysoで"こんにちは、◯◯さん"と表示
      - 〇〇の部分にはnameを表示

  - 動作確認
    - "みやざきりゅうせい"と入力して確認
    - "魔人ブウ"と入力して確認

    - "◯◯さんの好きな食べ物は△△ですね"と「好きな食べ物は△△と、△△と、△△ですね」
        - 入力
          - 好きな食べ物を入力する
            - インポートする（List、ArrayList）
            - System inを渡してnewする
            - 変数scに格納する
            - sc.nextLine()で食べ物を入力する
            - scanner.useDelimiter(",")
        - 処理
          - List<String>foodsにnew ArrayList<String>を代入
          - sc.nextLine()をString lineに代入
          - if～else if文で分岐する
          - リストの数がなければ表示しない、１個の場合、複数の場合(for文？)の３分岐で考える
          - if(list.size==0)やったら何も表示しない
          - else if (list.size=1){syso(name+"さんの好きな食べ物は"+foods[0]+"です")}
          - else if(list.size>1){syso(nameさんの好きな食べ物は)+for(i=0:i<=list.size:i++){"syso(list[i]と、)"}syso(ですね)
        - 出力
          - sysoで好きな食べ物は何ですか聞く(,で区切ってください)
          - 結果がポーン
        - 動作確認
          -   試す

          -フローチャート
          '''mermaid
         
            A[ナメェ入力]-->B{こんにちは、nameさん}
            B--if(list.size=0)-->c[なにも表示しない]
            B--if else(list.size=1)-->d[nameさんの好きな食べ物はfoodsです]
            b--if else(list.size>1)-->e[nameさんの好きな食べ物は～]
          
          '''








