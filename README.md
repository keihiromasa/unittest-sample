# jacocoを使ってpowermockを使ったユニットテストのカバレッジをとる

## 説明
* Webでちらほらと、powermockを使う際にはjacocoでのカバレッジ収集は不可能だ、という情報が見られます
* 実際にはoffline instrumentionをすることで収集可能
* とはいえ実際に収集できるようになるまでにそれなりの時間を費やしました
* そのため、ノウハウを共有します

## 使い方
* リポジトリをcloneし、mavenゴールを以下の通りにして実行してください
* `clean test jacoco:restore-instrumented-classes jacoco:report site`
 * `target/site/jacoco/index.html` にカバレッジ結果が出力されます
* Jenkinsなどでカバレッジ集計結果を見える化する場合は、`target/jacoco.exec`に集計結果が出ますので使って下さい

## 本家の情報など
* https://github.com/powermock/powermock/wiki/Code-coverage-with-JaCoCo
 * powermockの本家リポジトリのwiki
 * on-the-fly instrument(クラスロード時にinstrumentする)は無理だが、offline instrument(コンパイル直後にinstrumentする)なら可能、という情報が載っています
