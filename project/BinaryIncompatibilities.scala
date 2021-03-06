import com.typesafe.tools.mima.core._
import com.typesafe.tools.mima.core.ProblemFilters._

object BinaryIncompatibilities {
  val IR = Seq(
      // Breaking: FieldDef has new field `static`
      ProblemFilters.exclude[DirectMissingMethodProblem](
          "org.scalajs.core.ir.Trees#FieldDef.this"),
      ProblemFilters.exclude[DirectMissingMethodProblem](
          "org.scalajs.core.ir.Trees#FieldDef.apply"),
      ProblemFilters.exclude[DirectMissingMethodProblem](
          "org.scalajs.core.ir.Trees#FieldDef.copy"),
      ProblemFilters.exclude[IncompatibleResultTypeProblem](
          "org.scalajs.core.ir.Trees#FieldDef.copy$default$1"),
      ProblemFilters.exclude[IncompatibleResultTypeProblem](
          "org.scalajs.core.ir.Trees#FieldDef.copy$default$2"),
      ProblemFilters.exclude[IncompatibleResultTypeProblem](
          "org.scalajs.core.ir.Trees#FieldDef.copy$default$3"),

      // Breaking: PropertyDef has new field `static`
      ProblemFilters.exclude[DirectMissingMethodProblem](
          "org.scalajs.core.ir.Trees#PropertyDef.this"),
      ProblemFilters.exclude[DirectMissingMethodProblem](
          "org.scalajs.core.ir.Trees#PropertyDef.apply"),
      ProblemFilters.exclude[DirectMissingMethodProblem](
          "org.scalajs.core.ir.Trees#PropertyDef.copy"),
      ProblemFilters.exclude[IncompatibleResultTypeProblem](
          "org.scalajs.core.ir.Trees#PropertyDef.copy$default$1"),
      ProblemFilters.exclude[IncompatibleResultTypeProblem](
          "org.scalajs.core.ir.Trees#PropertyDef.copy$default$2"),

      // Breaking: TopLevelExportDef has been renamed to TopLevelMethodExportDef
      ProblemFilters.exclude[MissingClassProblem](
          "org.scalajs.core.ir.Trees$TopLevelExportDef"),
      ProblemFilters.exclude[MissingClassProblem](
          "org.scalajs.core.ir.Trees$TopLevelExportDef$"),
      ProblemFilters.exclude[DirectMissingMethodProblem](
          "org.scalajs.core.ir.Tags.TagTopLevelExportDef"),

      // private, not an issue
      ProblemFilters.exclude[DirectMissingMethodProblem](
          "org.scalajs.core.ir.Infos#MethodInfo.this"),
      ProblemFilters.exclude[DirectMissingMethodProblem](
          "org.scalajs.core.ir.Infos#GenInfoTraverser.generateClassExportsInfo")
  )

  val Tools = Seq(
      // private, not an issue
      ProblemFilters.exclude[DirectMissingMethodProblem](
          "org.scalajs.core.tools.linker.checker.IRChecker#CheckedField.this"),

      // private, not an issue
      ProblemFilters.exclude[DirectMissingMethodProblem](
          "org.scalajs.core.tools.linker.analyzer.Analyzer.org$scalajs$core$tools$linker$analyzer$Analyzer$$createMissingMethodInfo$default$2"),
      ProblemFilters.exclude[DirectMissingMethodProblem](
          "org.scalajs.core.tools.linker.analyzer.Analyzer.org$scalajs$core$tools$linker$analyzer$Analyzer$$createMissingMethodInfo$default$3"),

      // private[emitter], not an issue
      ProblemFilters.exclude[MissingMethodProblem](
          "org.scalajs.core.tools.linker.backend.emitter.ScalaJSClassEmitter.genClass"),
      ProblemFilters.exclude[MissingMethodProblem](
          "org.scalajs.core.tools.linker.backend.emitter.ScalaJSClassEmitter.genClassDef"),
      ProblemFilters.exclude[DirectMissingMethodProblem](
          "org.scalajs.core.tools.linker.backend.emitter.ScalaJSClassEmitter.genTopLevelExportDef"),
      ProblemFilters.exclude[DirectMissingMethodProblem](
          "org.scalajs.core.tools.linker.backend.emitter.ScalaJSClassEmitter.outputMode"),
      ProblemFilters.exclude[DirectMissingMethodProblem](
          "org.scalajs.core.tools.linker.backend.emitter.ScalaJSClassEmitter.semantics"),
      ProblemFilters.exclude[DirectMissingMethodProblem](
          "org.scalajs.core.tools.linker.backend.emitter.JSDesugaring.genCallHelper"),
      ProblemFilters.exclude[DirectMissingMethodProblem](
          "org.scalajs.core.tools.linker.backend.emitter.JSDesugaring.genLet"),
      ProblemFilters.exclude[DirectMissingMethodProblem](
          "org.scalajs.core.tools.linker.backend.emitter.JSDesugaring.genRawJSClassConstructor"),
      ProblemFilters.exclude[DirectMissingMethodProblem](
          "org.scalajs.core.tools.linker.backend.emitter.JSDesugaring.genEmptyMutableLet"),
      ProblemFilters.exclude[DirectMissingMethodProblem](
          "org.scalajs.core.tools.linker.backend.emitter.JSDesugaring.desugarTree"),
      ProblemFilters.exclude[DirectMissingMethodProblem](
          "org.scalajs.core.tools.linker.backend.emitter.JSDesugaring.genLoadJSFromSpec"),
      ProblemFilters.exclude[DirectMissingMethodProblem](
          "org.scalajs.core.tools.linker.backend.emitter.JSDesugaring.encodeClassVar"),
      ProblemFilters.exclude[DirectMissingMethodProblem](
          "org.scalajs.core.tools.linker.backend.emitter.JSDesugaring.desugarToFunction"),
      ProblemFilters.exclude[IncompatibleMethTypeProblem](
          "org.scalajs.core.tools.linker.backend.emitter.JSDesugaring.desugarToFunction"),
      ProblemFilters.exclude[DirectMissingMethodProblem](
          "org.scalajs.core.tools.linker.backend.emitter.JSDesugaring.envField"),
      ProblemFilters.exclude[IncompatibleMethTypeProblem](
          "org.scalajs.core.tools.linker.backend.emitter.JSDesugaring.envFieldDef"),
      ProblemFilters.exclude[DirectMissingMethodProblem](
          "org.scalajs.core.tools.linker.backend.emitter.JSDesugaring.genIsInstanceOf"),
      ProblemFilters.exclude[DirectMissingMethodProblem](
          "org.scalajs.core.tools.linker.backend.emitter.JSDesugaring.this"),
      ProblemFilters.exclude[DirectMissingMethodProblem](
          "org.scalajs.core.tools.linker.backend.emitter.JSDesugaring#JSDesugar.this"),

      // private, not an issue.
      ProblemFilters.exclude[DirectMissingMethodProblem](
          "org.scalajs.core.tools.linker.backend.emitter.JSDesugaring#Env.this")
  )

  val JSEnvs = Seq(
  )

  val JSEnvsTestKit = Seq(
  )

  val SbtPlugin = Seq(
  )

  val TestAdapter = Seq(
  )

  val CLI = Seq(
  )

  val Library = Seq(
  )

  val TestInterface = Seq(
  )
}
