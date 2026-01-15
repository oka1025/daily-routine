## ER図
<img width="823" height="996" alt="スクリーンショット 2026-01-15 142626" src="https://github.com/user-attachments/assets/ed9f9fad-b646-4363-82e2-9d1fbe264718" />


## サービス概要
ルーティンを設定し、達成したらチェックを入れ、どれぐらい達成できたかを確認できるアプリ。

## テーブル詳細
**Users（ユーザー情報）**
- email：ログイン認証用のメールアドレス
- encrypted_password：ログイン時に必要なパスワード

**Routines（作成したルーティンの情報）**
- title：ルーティンのタイトル
- user_id：どのユーザーが作成したか記録
- recurrence_rule：ルーティンの繰り返しに関するデータを保存
- start_at：ルーティンを始めた日付
- end_at：ルーティンを終えた日付（削除指定日より前にstart_atが存在する場合記録）
- created_at：ルーティン作成日時
- updated_at：編集日時
- deleted_at：削除日時（削除指定日以降にstart_atが存在する場合記録）

**routine_logs（その日付に設定されたルーティンを行ったか記録）**
- status：ルーティンを行ったか記録
- recorded_date：ルーティンの日付
- routine_id：どのルーティンを指定するか記録

## 機能
- [ ] ログイン前説明画面（未ログインでも観覧可能）
- [ ] ユーザー登録機能
- [ ] ログイン機能
- [ ] マイページ機能
- [ ] リスト追加機能
- [ ] リスト編集機能
- [ ] リスト削除機能
- [ ] 達成率確認機能

## 画面遷移図
Figma：https://www.figma.com/design/epjEQjMbrjY9e0UtO4Qn5S/%E3%83%AB%E3%83%BC%E3%83%86%E3%82%A3%E3%83%B3%E7%AE%A1%E7%90%86?node-id=0-1&t=R4Viq2f7dSzHM0WS-1
